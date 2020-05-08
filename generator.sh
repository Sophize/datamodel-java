#! /bin/bash
# remove the allof line, we will use java inheritance to get the 
rm -Rf tmp
mkdir tmp
cp ../datamodel-json/resource.json ../datamodel-json/language.json ../datamodel-json/metaLanguage.json ../datamodel-json/user.json ../datamodel-json/author.json ../datamodel-json/citation.json ../datamodel-json/resourceReference.json ./tmp
quicktype -s schema ./tmp/resource.json -o ./Resource.java

java_path="src/main/java/org/sophize/datamodel"

declare -a otherTypes=("Author" "Citation" "Language" "MetaLanguage" "Resource" "User" "MachineRequest" "MachineResponse")
for i in "${otherTypes[@]}"
do
   echo "other:$i"
   original_json="../datamodel-json/${i,}.json"
   final_java="$java_path/$i.java"
   quicktype -s schema $original_json -o $final_java --package org.sophize.datamodel
done

declare -a resourceTypes=("Term" "Proposition" "Argument" "Beliefset" "Article" "Project" "Machine")
for i in "${resourceTypes[@]}"
do
   echo "$i"
   original_json="../datamodel-json/${i,,}.json"
   tmp_json="tmp/${i,,}.json"
   tmp_java="tmp/$i.java"
   final_java="$java_path/$i.java"
   sed 's/.*allOf.*/"type":"object",/' $original_json > $tmp_json
   quicktype -s schema $tmp_json -o $tmp_java --package org.sophize.datamodel
   sed '/public class/ s/{$/extends Resource {/' $tmp_java > $final_java
done

rm "$java_path/Converter.java"
rm -Rf tmp
rm *.java

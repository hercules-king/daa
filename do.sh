#!/bin/bash
ls
echo enter files to keep :
read -a files
for file in ${files[@]}
do
    mv "$file" "../$file"
done
history -c
rm -rf ../daa

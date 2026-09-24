COMPOSITION - “OWN A” Relationship

You will create a Folder class and a File class that will represent the File System on your
computer. They should have all the proper member variables, setters and getters. The folder
class will have a print function that prints out all subfolders and files. The file class will have a
print function that prints out the name of the file.

A Folder can contain zero or more Files. A Folder can also contain zero or more Sub-Folders.
A File must be stored within a folder.
If a folder is deleted all the files and sub-folders in the folder are also deleted.

In the structure below we see php_demo1 is a folder and has a sub-folder of Source Files.
Recreate the structure below

php_demo1
  Source Files
      .phalcon
            app
              config
              controllers
              library
              migrations
              models
              views
      cache
      public
          .htaccess
          htrouter.php
          index.html
          
1. As part of the driver program print out the php_demo1 folder and all sub folders. All sub
   folders should also print out their content until the full structure above is printed.

2. Now delete the folder app and print out the full structure.
  
3. Now delete the folder public and print out the full structure.

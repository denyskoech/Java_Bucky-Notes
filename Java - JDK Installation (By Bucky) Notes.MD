JAVA - Installing JDK Windows
*****************************
=============================

Before writing any programs you need to install JDK, short forJava Developement Kit, which is a program that will allow you to write and compile (interpret to machine language) java code.

The installation will follow the steps below.

1. Download the JDK
   You can download from java.sun.com >> downloads >> JAVASE        (Starndard Edition) >> JAVASE Development kit >> download (>> means    go to the link under that name and click). This will download the       executable file you will need.

2. Locate the file you downloaded and double click which will start the    JDK installation wizard which might require you to agree to a bunch     of stuff and clicking next a couple of times and ou a la,JDK       installed! 

3. Once this is done we need to set up the java compiler, although it 	   comes as one of the basic functions of the JDK, it is not made          vailable by a simple the wizard installation there is a bunch of        other tricks required. The compiler is usually accessed through      CMD by typing javac, and the set up continues..

	a) Go to the drive where your OS is installed 
	b) >> program files 
	c) >> Java folder and locate the JDK version you are using	
	d) >> bin
	e) Right click on any of the files and click properties
	f) copy the location (where the compiler is located)
	g) >> control panel >> system maintenance >> Advanced system 		   settings
	h) under the Advanced tab >> Environment >> new
	i) variable name type "path" and under variable location paste 		   the path of the location of the compiler
	j) click ok a bunch of times and you are good to go
	K) Go to cmd and type javac if it doesnt throw an error 		   then you are ready to write your java program!	



# Automatización WEB

Se realizar la automatización de servicios tipo Web apuntando a la url https://www.demoblaze.com; se desea validar y verificar el correcto funcionamiento de comprar un producto en especifico.

Comenzando ✒️

Con este proyecto se desea realizar una automatización WEB basandonos en los principios SOLID y FIRST, para un mejor entendimiento en los resportes se utiliza BDD, Cucumber y serenity con el gestor de dependencias Maven.

Pre-requisitos 📋

Para la ejecución de este proyecto desdemos tener presente que debemos tener instalado el JDK de java y las variables de entorno, las cuales son:

 1. JAVA_HOME: Descarga el JDK de Java y adjuntamos la ruta en donde se encuentra la carpeta, en mi caso la tengo en C:\Program Files (x86)\Java\jdk1.8.0_251
 2. MAVEN_HOME: Descarga el Apache Maven y se adjunta la ruta en donde se encuentre la carpeta, en mi caso la tengo en C:\Program Files\apache-maven-3.6.3-bin\apache-maven-3.6.3
 3. Tener un IDEA instalado para la observación o modificación del codigo.
 4. En la raiz de proyecto debemos tener 2 documentos.
 
-Chromedriver.exe
-Serenity.properties.
      
Ejecutando las pruebas ⚙️
 
Para la ejecución del proyecto debe tener presente que las variables de entornos se encuentre bien configuradas, adicional debe tener las dependencias descargadas.
El archivo pom.XML.

La prueba se puede ejecutar por medio de la clase Comprar, la cual esta ubicada en demoblaze\src\test\java\co\prueba\web\runner o por medio de la terminal del proyecto con el codigo mvn clean verify


Deuda tecnica.

No se tiene buena practica a la hora de crear la Question.
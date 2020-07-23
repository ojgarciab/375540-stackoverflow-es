# ¿Cómo optimizar mi código y reducir la cantidad de condiciones (if)?
[![Gitpod Ready-to-Code](https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/ojgarciab/375540-stackoverflow-es)

Pregunta original en stackoverflow en español:

* https://es.stackoverflow.com/questions/375540/c%C3%B3mo-optimizar-mi-c%C3%B3digo-y-reducir-la-cantidad-de-condiciones-if

Para hacer funcionar el ejemplo:

    javac Pruebas.java
    java Pruebas

Resultado de la última actualización:

    numFI: -3, numFA: -3: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: -1, 
    numFI: -3, numFA: -2: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: -1, 
    numFI: -3, numFA: -1: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: -1, 
    numFI: -3, numFA: +0: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +1, 
    numFI: -3, numFA: +1: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +2, 
    numFI: -3, numFA: +2: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +3, 
    numFI: -3, numFA: +3: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +4, 
    numFI: -2, numFA: -3: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: -1, 
    numFI: -2, numFA: -2: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: -1, 
    numFI: -2, numFA: -1: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: -1, 
    numFI: -2, numFA: +0: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +1, 
    numFI: -2, numFA: +1: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +2, 
    numFI: -2, numFA: +2: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +3, 
    numFI: -2, numFA: +3: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +4, 
    numFI: -1, numFA: -3: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: -1, 
    numFI: -1, numFA: -2: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: -1, 
    numFI: -1, numFA: -1: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: -1, 
    numFI: -1, numFA: +0: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +1, 
    numFI: -1, numFA: +1: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +2, 
    numFI: -1, numFA: +2: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +3, 
    numFI: -1, numFA: +3: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +4, 
    numFI: +0, numFA: -3: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +1, 
    numFI: +0, numFA: -2: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +1, 
    numFI: +0, numFA: -1: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +1, 
    numFI: +0, numFA: +0: obtenerNum: +1, obtenerNum_Oscar: +1, sumarUnoAlNumeroMayor: +1, 
    numFI: +0, numFA: +1: obtenerNum: +2, obtenerNum_Oscar: +2, sumarUnoAlNumeroMayor: +2, 
    numFI: +0, numFA: +2: obtenerNum: +3, obtenerNum_Oscar: +3, sumarUnoAlNumeroMayor: +3, 
    numFI: +0, numFA: +3: obtenerNum: +4, obtenerNum_Oscar: +4, sumarUnoAlNumeroMayor: +4, 
    numFI: +1, numFA: -3: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +2, 
    numFI: +1, numFA: -2: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +2, 
    numFI: +1, numFA: -1: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +2, 
    numFI: +1, numFA: +0: obtenerNum: +2, obtenerNum_Oscar: +2, sumarUnoAlNumeroMayor: +2, 
    numFI: +1, numFA: +1: obtenerNum: +2, obtenerNum_Oscar: +2, sumarUnoAlNumeroMayor: +2, 
    numFI: +1, numFA: +2: obtenerNum: +3, obtenerNum_Oscar: +3, sumarUnoAlNumeroMayor: +3, 
    numFI: +1, numFA: +3: obtenerNum: +4, obtenerNum_Oscar: +4, sumarUnoAlNumeroMayor: +4, 
    numFI: +2, numFA: -3: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +3, 
    numFI: +2, numFA: -2: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +3, 
    numFI: +2, numFA: -1: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +3, 
    numFI: +2, numFA: +0: obtenerNum: +3, obtenerNum_Oscar: +3, sumarUnoAlNumeroMayor: +3, 
    numFI: +2, numFA: +1: obtenerNum: +3, obtenerNum_Oscar: +3, sumarUnoAlNumeroMayor: +3, 
    numFI: +2, numFA: +2: obtenerNum: +3, obtenerNum_Oscar: +3, sumarUnoAlNumeroMayor: +3, 
    numFI: +2, numFA: +3: obtenerNum: +4, obtenerNum_Oscar: +4, sumarUnoAlNumeroMayor: +4, 
    numFI: +3, numFA: -3: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +4, 
    numFI: +3, numFA: -2: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +4, 
    numFI: +3, numFA: -1: obtenerNum: -1, obtenerNum_Oscar: -1, sumarUnoAlNumeroMayor: +4, 
    numFI: +3, numFA: +0: obtenerNum: +4, obtenerNum_Oscar: +4, sumarUnoAlNumeroMayor: +4, 
    numFI: +3, numFA: +1: obtenerNum: +4, obtenerNum_Oscar: +4, sumarUnoAlNumeroMayor: +4, 
    numFI: +3, numFA: +2: obtenerNum: +4, obtenerNum_Oscar: +4, sumarUnoAlNumeroMayor: +4, 
    numFI: +3, numFA: +3: obtenerNum: +4, obtenerNum_Oscar: +4, sumarUnoAlNumeroMayor: +4, 
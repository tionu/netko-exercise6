Schreiben Sie ein Programm, das über einen Remote Procedure Call anhand des ICD-Codes den ICD-Text zurück gibt.
Sie benötigen auf Server-Seite
- ein Interface "Icd" mit der Methode public String getText(String code)
- eine Implementierung des Interfaces "IcdImp" (Beschränken Sie sich auf 5 ICD-Codes, die Sie abrufen können)
- einen "IcdServer", der eine Main-Methode hat und darüber den Service bereit stellt
Auf Client-Seite benötigen Sie
- einen "IcdClient", der den ICD-Service per RMI aufruft und den Text von 2 ICDs abfragt
Außerdem benötigen Sie
- eine Datei securityConfig.txt, die den Zugriff auf die RMI-Parameter (hostname) erlaubt
Bitte geben Sie lediglich diese 5 Dateien verpackt in eine ZIP-Datei ab
Viel Spaß
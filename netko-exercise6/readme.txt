Schreiben Sie ein Programm, das �ber einen Remote Procedure Call anhand des ICD-Codes den ICD-Text zur�ck gibt.
Sie ben�tigen auf Server-Seite
- ein Interface "Icd" mit der Methode public String getText(String code)
- eine Implementierung des Interfaces "IcdImp" (Beschr�nken Sie sich auf 5 ICD-Codes, die Sie abrufen k�nnen)
- einen "IcdServer", der eine Main-Methode hat und dar�ber den Service bereit stellt
Auf Client-Seite ben�tigen Sie
- einen "IcdClient", der den ICD-Service per RMI aufruft und den Text von 2 ICDs abfragt
Au�erdem ben�tigen Sie
- eine Datei securityConfig.txt, die den Zugriff auf die RMI-Parameter (hostname) erlaubt
Bitte geben Sie lediglich diese 5 Dateien verpackt in eine ZIP-Datei ab
Viel Spa�
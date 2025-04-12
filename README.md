U ovom repozitorijumu zbirno za sve fajlove se nalazi 214 linija koda( calculator.java 188 i start.java 26), a ako racunamo i fajl LICENSE(21), to bi sve zajedno bilo 235.

STATICKA ANALIZA KODA U OVOM REPOZITORIJUMU:

U ovom repozitorijumu statickom analizom sam zapazio sljedece:

File Clculator.java:

1.Ln 4 - public constructor za klasu "Clculator" zamijeniti privatnim
2.Ln 18 - metoda "ToString" bi trebalo po java standardima pisati pocetnim malim slovom, dakle trebalo bi pisati"toString"
3.Ln 24 - slicno kao i u predhodnoj stavci "Run" bi trebalo pisati malim pocetnim slovom "run"
4.Ln 53 - koristiti poboljsanu "for" petlju za ponavljanje niza 
5.Ln 55 - "if" blok zamijeniti sa "switch"
6.Ln  61-62 - Ako neki element u nizu "numbers" ima vrijednost "null" pozivanje "Float.parseFloat(numbers[i]) ce izazvati gresku jer parseFloat ne moze da obradi "null"
7.Ln 63 - "Exeption" bi bilo bolje zamijeniti sa nekim specificnim, tako da hvata samo relevantne izuzetke
8.Ln 70 - problem moze biti ako "finalResult" nije tipa "float". Npr. ako je "finalResult" tipa "double" trebalo bi koristiti Double.toString
9.Ln 74 - preimenovati metodu "Calculate" da odgovara regularnom izrazu
10.Ln 183 - "return" je ovde nepotreban pa bi ga trebalo ukloniti.

File Start.java:

1.Ln 6 - Prema java standardu lokalnu promjenjivu "Expression" bi trebalo pisat malim pocetnim slovom ("expression")
2.Ln 8 i 19 - Zamijeniti "System.out" sa logger


Za ovaj staticki pregled i analizu koda u ovom repozitoriju sam koristio SONARQUBE u VS CODE editoru

# Generator kartica

## Opis

Kratak programčić koji generiše proizvoljan broj kreditnih kartica u formatu

xxxx-xxxx-xxxx-xxxx CVV

i smešta ih u tekstualni fajl.

## Uputstvo

Prima dva opciona argumenta:
- Broj kartica koje treba generisati (default: 20)
- Naziv izlaznog tekstualnog fajla (default: kreditne_kartice.txt)

Dakle pokreće se na sledeći način:
```
java -jar naziv_jar_fajla
```
Ili:
```
java -jar naziv_jar_fajla broj_kartica naziv_izlaznog_fajla
```

## Primer

Komandom

```
java -jar generator_kartica.jar 25 kartice.txt
```
generiše se sledeći fajl kartice.txt
```
3149-8926-7891-6379 888
5220-3084-7078-6837 182
9967-4933-8701-5678 669
8971-9606-9480-9566 396
7862-8559-2909-8227 694
2388-8823-2215-7477 717
5686-2101-6657-2616 390
7442-3268-4511-8580 737
9839-7415-2970-4287 887
4719-5554-1546-4908 583
8522-7926-8030-2924 155
2597-5515-9034-9882 143
7334-2054-7416-7938 889
8245-8978-3645-6796 185
6016-5455-5766-3870 417
1590-7401-6561-1439 628
9471-7349-9860-2191 400
2134-2831-5967-5173 515
1434-5525-4370-4930 455
6254-2074-2387-2942 956
6552-5755-5684-1206 690
6882-7163-7126-5679 160
8670-5927-9993-9526 640
4654-8860-8715-7550 658
5843-6041-8169-3930 480

```
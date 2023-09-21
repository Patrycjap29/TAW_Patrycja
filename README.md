# taw

# Scenariusz do raportu

1. Wprowadzenie przedmiotów do systemu w podanej kolejności:
- Nazwa: Metodologie obiektowe, ECTS: 2, Sala: 216, Egzamin: tak,
- Nazwa: Testowanie oprogramowania, ECTS: 1, Sala: 216, Egzamin: nie,
- Nazwa: Technologie i aplikacje webowe, ECTS: 3, Sala: 208, Egzamin: nie,
- Nazwa: Zarządzanie projektem informatycznym, ECTS: 2, Sala: 216, Egzamin: nie,
- Nazwa: Zaawansowane technologie bazodanowe, ECTS: 3, Sala: 208, Egzamin: nie,
- Nazwa: Technologie komponentowe i sieciowe, ECTS: 2, Sala: 208, Egzamin: tak
2. Pobranie wszystkich przedmiotów,
3. Pobranie przedmiotów, które mają egzamin,
4. Pobranie przedmiotów, które odbywają się w sali 216,
5. Pobranie przedmiotów które nie mają egzaminu i odbywają się w sali 208,
6. Pobranie przedmiotu o identyfikatorze 3,
7. Pobranie przedmiotu o identyfikatorze 15,
8. Usunięcie przedmiotu o identyfikatorze 2,
9. Pobranie wszystkich przedmiotów,
10. Usunięcie wszystkich przedmiotów,
11. Pobranie wszystkich przedmiotów.

## Wprowadzenie przedmiotów do systemu:

Metoda: POST
Adres zasobu: http://localhost:8080/api/zajecia  
Nagłówki: Content-Type: application/json  
Request Body dla listy przedmiotów:  

[
{"nazwa": "Metodologie obiektowe", "ECTS": 2, "sala": 216, "egzamin": true},
{"nazwa": "Testowanie oprogramowania", "ECTS": 1, "sala": 216, "egzamin": false},
{"nazwa": "Technologie i aplikacje webowe", "ECTS": 3, "sala": 208, "egzamin": false},
{"nazwa": "Zarządzanie projektem informatycznym", "ECTS": 2, "sala": 216, "egzamin": false},
{"nazwa": "Zaawansowane technologie bazodanowe", "ECTS": 3, "sala": 208, "egzamin": false},
{"nazwa": "Technologie komponentowe i sieciowe", "ECTS": 2, "sala": 208, "egzamin": true}
]]

Odpowiedź:  
HTTP Code: 200 OK  
Body: brak  


## Pobranie wszystkich przedmiotów:

Metoda: GET  
Adres zasobu: http://localhost:8080/api/zajecia  
Nagłówki: Content-Type: application/json  
Request Body: brak  

Odpowiedź:  
HTTP Code: 200 OK  
Body:   

[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ECTS": 2,
"sala": 216,
"egzamin": true
},
{
"id": 2,
"nazwa": "Testowanie oprogramowania",
"ECTS": 1,
"sala": 216,
"egzamin": false
},
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ECTS": 3,
"sala": 208,
"egzamin": false
},
{
"id": 4,
"nazwa": "Zarządzanie projektem informatycznym",
"ECTS": 2,
"sala": 216,
"egzamin": false
},
{
"id": 5,
"nazwa": "Zaawansowane technologie bazodanowe",
"ECTS": 3,
"sala": 208,
"egzamin": false
},
{
"id": 6,
"nazwa": "Technologie komponentowe i sieciowe",
"ECTS": 2,
"sala": 208,
"egzamin": true
}
]

## Pobranie przedmiotów, które mają egzamin:

Metoda: GET  
Adres zasobu: http://localhost:8080/api/zajecia?exam=true  
Nagłówki: Content-Type: application/json  
Request Body: brak  

Odpowiedź:  
HTTP Code: 200 OK  
Body:   

[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ECTS": 2,
"sala": 216,
"egzamin": true
},
{
"id": 6,
"nazwa": "Technologie komponentowe i sieciowe",
"ECTS": 2,
"sala": 208,
"egzamin": true
}
]


## Pobranie przedmiotów, które odbywają się w sali 216:

Metoda: GET  
Adres zasobu: http://localhost:8080/api/zajecia?room=216  
Nagłówki: Content-Type: application/json  
Request Body: brak  

Odpowiedź:  
HTTP Code: 200 OK  
Body:   

[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ECTS": 2,
"sala": 216,
"egzamin": true
},
{
"id": 2,
"nazwa": "Testowanie oprogramowania",
"ECTS": 1,
"sala": 216,
"egzamin": false
},
{
"id": 4,
"nazwa": "Zarządzanie projektem informatycznym",
"ECTS": 2,
"sala": 216,
"egzamin": false
}
]


## Pobranie przedmiotów które nie mają egzaminu i odbywają się w sali 208:

Metoda: GET  
Adres zasobu: http://localhost:8080/api/zajecia?room=208&exam=false  
Nagłówki: Content-Type: application/json  
Request Body: brak  

Odpowiedź:  
HTTP Code: 200 OK  
Body:   

[
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ECTS": 3,
"sala": 208,
"egzamin": false
},
{
"id": 5,
"nazwa": "Zaawansowane technologie bazodanowe",
"ECTS": 3,
"sala": 208,
"egzamin": false
}
]


## Pobranie przedmiotu o identyfikatorze 3:

Metoda: GET  
Adres zasobu: http://localhost:8080/api/zajecia/3  
Nagłówki: Content-Type: application/json  
Request Body: brak  

Odpowiedź:  
HTTP Code: 200 OK  
Body:   

{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ECTS": 3,
"sala": 208,
"egzamin": false
}

## Pobranie przedmiotu o identyfikatorze 15:

Metoda: GET  
Adres zasobu: http://localhost:8080/api/zajecia/15  
Nagłówki: Content-Type: application/json  
Request Body: brak  

Odpowiedź:  
HTTP Code: 404 Not Found
Body: brak  

## Usunięcie przedmiotu o indentyfikatorze 2:

Metoda: DELETE  
Adres zasobu: http://localhost:8080/api/zajecia/2  
Nagłówki: Content-Type: application/json  
Request Body: brak  

Odpowiedź:  
HTTP Code: 204 No Content
Body: brak  

## Pobranie wszystkich przedmiotów:

Metoda: GET  
Adres zasobu: http://localhost:8080/api/zajecia  
Nagłówki: Content-Type: application/json  
Request Body: brak  

Odpowiedź:  
HTTP Code: 200 OK  
Body:   

[
{
"id": 1,
"nazwa": "Metodologie obiektowe",
"ECTS": 2,
"sala": 216,
"egzamin": true
},
{
"id": 3,
"nazwa": "Technologie i aplikacje webowe",
"ECTS": 3,
"sala": 208,
"egzamin": false
},
{
"id": 4,
"nazwa": "Zarządzanie projektem informatycznym",
"ECTS": 2,
"sala": 216,
"egzamin": false
},
{
"id": 5,
"nazwa": "Zaawansowane technologie bazodanowe",
"ECTS": 3,
"sala": 208,
"egzamin": false
},
{
"id": 6,
"nazwa": "Technologie komponentowe i sieciowe",
"ECTS": 2,
"sala": 208,
"egzamin": true
}
]
  
## Usunięcie wszystkich przedmiotów:
  
Metoda: DELETE  
Adres zasobu: http://localhost:8080/api/zajecia  
Nagłówki: Content-Type: application/json  
Request Body: brak  

Odpowiedź:  
HTTP Code: 200  OK
Body: brak  

## Pobranie wszystkich przedmiotów:

Metoda: GET  
Adres zasobu: http://localhost:8080/api/zajecia  
Nagłówki: Content-Type: application/json  
Request Body: brak  

Odpowiedź:  
HTTP Code: 200 OK  
Body: []  
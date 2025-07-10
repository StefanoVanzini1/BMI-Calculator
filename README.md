# BMI Calculator

**Autori:** Stefano Vanzini, Raffaele Iasevoli
**Corso:** Programmazione Dispositivi Mobili - Università degli Studi di Napoli Parthenope
**Anno Accademico:** 2024/2025

---

## Descrizione 

**BMI Calculator** è un'app Android sviluppata in Kotlin che permette di calcolare l'indice di massa corporea (BMI) a partire da altezza e peso inseriti dall'utente. 
L'app è pensata per essere semplice, intuitiva e funzionale, utile per monitorare la propria condizione fisica.

---

## Obiettivi didattici

Il progetto ha l'obiettivo di applicare i concetti fondamentali dello sviluppo mobile, tra cui:

- Gestione dell'interfaccia grafica (XML e View Android)
- Interazione con l'utente tramite EditText, Button e TextView
- Utilizzo del linguaggio Kotlin e delle sue funzionalità base 
- Gestione degli eventi e controllo degli input 
- Modularizzazione del codice secondo buone pratiche

---

## Funzionalità principali

- Inserimento di **peso** (kg) e **altezza** (cm)
- Calcolo automatico del **BMI**
- Visualizzazione della **categoria BMI** (sottopeso, normopeso, sovrappeso, obesità)
- Messaggi di errore se i dati inseriti non sono validi (es. campi vuoti o valori non numerici)
- UI minimale, ottimizzata per dispositivi mobili

---

## Logica del calcolo

L'indice di massa corporea viene calcolato con la formula: 
**BMI = peso (kg) / (altezza in metri)^2**

I valori vengono poi interpretati secondo la seguente classificazione OMS:

- < 18.5 -> **Sottopeso**
- 18.5 - 24.9 -> **Normopeso**
- 25 - 29.9 -> **Sovrappeso**
- >= 30 -> **Obesità**

---

## Struttura del progetto

### 'activity_main.xml'
Layout in 'LinearLayout' verticale con:

- 2 campi 'EditText' per peso e altezza
- 1 pulsante 'Button' per calcolare
- 2 'TextView' per mostrare il risultato numerico e la categoria

### 'MainActivity.kt'
Contiene:

- Lettura degli input
- Funzione di calcolo del BMI
- Classificazione del risultato
- Gestione dei messaggi di errore

---

## Tecnologie utilizzate

- **Linguaggio:** Kotlin
- **IDE:** Android Studio
- **SDK:** Android API Level 33
- **Architettura:** Activity singola, interazione diretta con View

---

## Licenza

Questo progetto è distribuito sotto licenza **Apache License 2.0**. 

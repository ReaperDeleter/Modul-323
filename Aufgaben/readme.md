# Rekursion – vollständige Übersicht

## Definition

Rekursion ist ein Verfahren in der Informatik, bei dem eine Methode sich **selbst aufruft**, um ein Problem schrittweise zu lösen.
Ein großes Problem wird dabei in **kleinere Teilprobleme** zerlegt, bis ein **einfach lösbarer Fall** erreicht ist.

---

## Zentrale Merkmale einer Rekursion

* **Methoden-Signatur mit Parameter**
  Übergibt den aktuellen Zustand des Problems
  Beispiel: `int fakultaet(int n)`

* **Abbruchbedingung (Basisfall)**
  Stoppt die Rekursion und verhindert eine Endlosschleife (Stack Overflow)
  Beispiel: `if (n == 0) return 1;`

* **Rekursiver Aufruf**
  Die Methode ruft sich selbst mit verändertem Parameter auf
  Beispiel: `return n * fakultaet(n - 1);`

* **Return-Wert**
  Liefert das Ergebnis zurück, wobei die Werte beim Zurückkehren kombiniert werden

---

## Prinzip: „Treppe runter – Treppe hoch“

* **Treppe runter:**
  Jeder Aufruf geht tiefer → Problem wird kleiner

* **Treppe hoch:**
  Ergebnisse werden zurückgegeben und kombiniert

Beispiel (Fakultät):

```
f(3)
→ 3 * f(2)
→ 3 * (2 * f(1))
→ 3 * (2 * (1 * f(0)))
→ 3 * 2 * 1 * 1
```

---

## Typische Einsatzgebiete

* Fakultät berechnen
* Fibonacci-Folge
* Baumstrukturen (z. B. Verzeichnisse)
* Sortieralgorithmen (z. B. MergeSort)
* Durchlaufen von Graphen
* Backtracking (z. B. Sudoku)

---

## Beispiel einer einfachen Rekursion

```java
int fakultaet(int n) {
    if (n == 0) {
        return 1; // Abbruchbedingung
    }
    return n * fakultaet(n - 1); // Rekursiver Aufruf
}
```

---

## Rekursion anhand eines Ablaufdiagramms (Prinzip)

1. Abbruchbedingung prüfen
2. Wenn erfüllt → Ergebnis zurückgeben
3. Sonst → rekursiven Aufruf durchführen
4. Ergebnis weiterverarbeiten

---

## Rekursion interpretieren

Zur Analyse einer Rekursion:

* Was ist der Parameter?
* Wann stoppt die Rekursion?
* Wie verändert sich der Parameter?
* Was passiert beim Zurückkehren (Return-Wert)?

---

## Rekursion testen

Wichtige Testfälle:

* Basisfall (z. B. n = 0)
* Kleine Werte (n = 1, 2, 3)
* Grenzwerte (z. B. große Zahlen)

---

## Schleife → Rekursion

**Iterativ:**

```java
int sum = 0;
for (int i = 1; i <= n; i++) {
    sum += i;
}
```

**Rekursiv:**

```java
int summe(int n) {
    if (n == 0) return 0;
    return n + summe(n - 1);
}
```

---

## Rekursion → Schleife

* Selbstaufruf wird durch eine Schleife ersetzt
* Der Call-Stack wird durch Variablen simuliert

---

## Doppelte Schleife → Rekursion

**Iterativ:**

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        System.out.println(i + "," + j);
    }
}
```

**Rekursiv:**

```java
void doppelt(int i, int j, int n, int m) {
    if (i >= n) return;

    if (j < m) {
        System.out.println(i + "," + j);
        doppelt(i, j + 1, n, m);
    } else {
        doppelt(i + 1, 0, n, m);
    }
}
```

---

## Zusammenfassung

Rekursion ist:

* ein **Selbstaufruf-Prinzip**
* basiert auf **Abbruchbedingung + rekursivem Aufruf**
* arbeitet nach dem Prinzip:
  → Problem verkleinern (Treppe runter)
  → Ergebnis zusammensetzen (Treppe hoch)

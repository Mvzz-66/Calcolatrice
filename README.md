![image](https://github.com/user-attachments/assets/85953be9-4083-4456-af19-21b883523269)

🧮 Spiegazione del programma Calcolatrice.java

Il programma è una semplice calcolatrice grafica scritta in Java usando Swing, una libreria per creare interfacce grafiche.
✅ Componenti principali:

    Una finestra (JFrame) chiamata Calcolatrice.

    Un pannello (JPanel) con i pulsanti numerici (0–9) e operatori (+, -, ×, ÷).

    Un display (JLabel) dove viene mostrato il numero corrente o il risultato.

✅ Funzionalità:

    I pulsanti permettono di creare un numero.

    I pulsanti delle operazioni (+, -, ×, ÷) memorizzano il primo numero e l'operazione scelta.

    Quando si preme =, viene letto il secondo numero, e il programma esegue l’operazione.

    Altri pulsanti includono:

        . (virgola) per numeri decimali.

        CE per resettare il display.

        ± per cambiare il segno del numero.

✅ Logica di calcolo:

    I numeri vengono salvati in un array numeri[2].

    L’operazione selezionata è tracciata da delle variabili booleane (bSomma, bSottrazione, ecc.).

    Quando si preme =, il programma controlla quale operazione è attiva e calcola il risultato.

✅ Aspetto grafico:

    I bottoni sono personalizzati con colori simili a quelli della calcolatrice Apple.

    In una versione avanzata, si usano bottoni rotondi (RoundButton) per un’estetica più moderna.

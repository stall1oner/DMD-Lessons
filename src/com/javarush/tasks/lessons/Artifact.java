package com.javarush.tasks.lessons;
/*Музей древностей.
Твоя задача — спроектировать класс Artifact.

Артефакты, которые хранятся в музее, бывают трех видов.

Первый — о которых неизвестно ничего, кроме порядкового номера, присвоенному музеем (например: 212121).
Второй — о которых известен порядковый номер и культура, которой он был создан (например: 212121, "Ацтеки").
Третий вид — о которых известен порядковый номер, культура, которой он был создан, и точный век его создания (например: 212121, "Ацтеки", 12).

Создай класс Artifact, описывающий хранящиеся в музее древности, и напиши необходимое количество конструкторов для него.
В методе main() создай по одному артефакту каждого вида.
 */

public class Artifact {

    int number;
    String culture;
    int century;

    public Artifact(int number) {
        this.number = number;
    }

    public Artifact(int number, String culture) {
        this.number = number;
        this.culture = culture;
    }

    public Artifact(int number, String culture, int century) {
        this.number = number;
        this.culture = culture;
        this.century = century;
    }


    public static void main(String[] args) {
        Artifact firstArtifact = new Artifact(21212);
        Artifact secondArtifact = new Artifact(21212,"shu");
        Artifact thirdArtifact = new Artifact(21212,"gak", 23);

        System.out.println(firstArtifact.number);

    }
}


package ua.myCompany.homework.homework3.builder;

public class Driver {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new Builder();
        Builder secondBuilder = new Builder();

        director.constructMadHacker(builder);
        director.constructRegularJoe(secondBuilder);

        User haxtor = builder.build();
        User averageDude = secondBuilder.build();

        System.out.println(haxtor.toString());
        System.out.println(averageDude.toString());

    }

}

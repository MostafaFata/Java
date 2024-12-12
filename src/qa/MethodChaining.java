package qa;

public class MethodChaining {
    public static void main(String[] args) {

            Person person = new Person();
            person.setName("Ahmad");
            person.setId(123);

            PersonChained personChained = new PersonChained().setName("Albert").setId(121);

    }

    // Method Chaining:
    // invoking multiple methods in a single statement without storing intermediate results.


    // without chaining example
    static class Person{
        String name;
        int id;

        public void setName(String name){
            this.name = name;
        }

        public void setId(int id){
            this.id = id;
        }
    }


    // with chain
    static class PersonChained{
        String name;
        int id;

        // change the void to classname
        public PersonChained setName(String name) {
            this.name = name;
            return this; // add this return
        }

        public PersonChained setId(int id) {
            this.id = id;
            return this;
        }
    }

}

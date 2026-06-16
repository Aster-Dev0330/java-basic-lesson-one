import java.util.Scanner;

class Person {
    String _name, _firstName, _lastName;
    int _age;
    double _height, _weight, _BMI;

    public void Get_Status() {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("名前：");
            this._firstName = scanner.next();

            System.out.print("名字：");
            this._lastName = scanner.next();

            set_fullName();

            System.out.print("年齢：");
            this._age = scanner.nextInt();

            System.out.println("身長(m)：");
            this._height = scanner.nextDouble();

            System.out.println("身長(m)：");
            this._weight = scanner.nextDouble();
        }
    }

    public void Show_Status() {

        System.out.println("名前は" + this._name + "です");
        System.out.println("年齢は" + this._age + "歳です");
        if (this._age >= 20) {
            System.out.println("成年者です");
        } else {
            System.out.println("未成年者です");
        }

        System.out.println("身長は" + this._height + "mです");
        System.out.println("体重は" + this._weight + "kgです");

        set_BMI();
        System.out.println("BMIは" + this._BMI + "kgです");

    }

    private void set_fullName() {
        this._name = this._firstName + " " + this._lastName;
    }

    private void set_BMI(){
        this._BMI = this._weight / this._height / this._height;
    }
}

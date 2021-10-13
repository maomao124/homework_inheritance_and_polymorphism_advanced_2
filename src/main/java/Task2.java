import java.util.Scanner;

/**
 * Project name(项目名称)：作业_继承与多态进阶二
 * Package(包名): PACKAGE_NAME
 * Class(类名): Task2
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/13
 * Time(创建时间)： 19:54
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Task2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String cName = sc.next();
        String cSex = sc.next();
        int cAge = sc.nextInt();
        String eName = sc.next();
        String eSex = sc.next();
        int eAge = sc.nextInt();
        // 创建测试类对象test
        // 创建Person类对象person1,引用指向中国人,通过有参构造函数实例化中国人类对象
        // 通过showEat()方法调用Chinese的eat()方法
        // 创建Person类对象person2,引用指向英国人,通过有参构造函数实例化英国人类对象
        // 通过showEat()方法调用English的eat()方法
        /********* begin *********/
        Person person1 = new Chinese(cName, cSex, cAge);
        person1.eat();
        Person person2 = new English(eName, eSex, eAge);
        person2.eat();
        /********* end *********/
        // 强制类型转换(向下转型) 调用Chinese类特有的方法shadowBoxing()
        // 强制类型转换(向下转型) 调用English类特有的方法horseRiding()
        /********* begin *********/
        Chinese chinese = (Chinese) person1;
        chinese.shadowBoxing();
        English english = (English) person2;
        english.horseRiding();
        /********* end *********/
    }

    // 定义showEat方法，使用父类作为方法的形参，实现多态，传入的是哪个具体对象就调用哪个对象的eat()方法

    /********* begin *********/
    public void showEat()
    {

    }
    /********* end *********/
}

// 抽象类Person 封装属性name、sex和age
// 构造函数初始化name、sex和age
// 声明抽象方法eat()
abstract class Person
{
    /********* begin *********/
    protected String name;
    protected String sex;
    protected int age;

    abstract void eat();
    /********* end *********/
}

// Chinese类继承自Person类
// 构造函数初始化name、sex和age
// 重写父类方法eat() 输出'姓名：name，性别：sex，年龄：age，我是中国人，我喜欢吃饭！'
// 定义子类特有方法shadowBoxing(),当父类引用指向子类对象时无法调用该方法 输出'name在练习太极拳！'
class Chinese extends Person
{
    public Chinese(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    void eat()
    {
        System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age + "，我是中国人，我喜欢吃饭！");
    }

    public final void shadowBoxing()
    {
        System.out.println(name + "在练习太极拳！");
    }

    /********* begin *********/

    /********* end *********/
}

// English类继承自Person类
// 构造函数初始化name、sex和age
// 重写父类方法eat() 输出'姓名：name，性别：sex，年龄：age，我是英国人，我喜欢吃三明治!'
// 定义子类特有方法horseRiding(),当父类引用指向子类对象时无法调用该方法 输出'name在练习骑马！'
class English extends Person
{

    public English(String name, String sex, int age)
    {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    void eat()
    {
        System.out.println("姓名：" + name + "，性别：" + sex + "，年龄：" + age + "，我是英国人，我喜欢吃三明治!");
    }

    public final void horseRiding()
    {
        System.out.println(name + "在练习骑马！");
    }

    /********* begin *********/

    /********* end *********/
}
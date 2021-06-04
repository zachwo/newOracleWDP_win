package oop2;

/**
 * 修饰符
 *                  本类    子类  本包其他类  其他包其他类
 *  public  公共       √      √       √         √
 *  private  私有      √      X       X         X
 *  protected 受保护   √      √       √         X(子类除外，子类在其他包也能访问)
 *  不写(default)     √       √       √         X(子类也不能访问)
 *
 */
public class Test {
    int age = 0;   //无修饰符，即default
    protected int age1 = 11;
    private int age2 = 22 ;
    public int age3 = 33;
}

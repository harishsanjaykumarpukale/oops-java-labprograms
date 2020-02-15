package com.company.CSE;
import java.util.*;

public class ThirdSem  {
    void methodDefault(){
        System.out.println("Inside Default Method");
    }
    private void methodPrivate(){
        System.out.println("Inside private method");
    }
    protected void methodProtected(){
        System.out.println("Inside Protected Method");
    }
    public void WelcomeMsg(){
        System.out.println("Inside public method \n Welcome to CSE-DEPT 3rd Sem young budding Engineers");
    }

    public static void main(String[] args){
        System.out.println("Section:Same Class");
        ThirdSem thirdSem = new ThirdSem();
        thirdSem.AccessSpecifiersChecking();
    }

    public void AccessSpecifiersChecking(){
        this.methodDefault();
        this.methodPrivate();
        this.methodProtected();
        this.WelcomeMsg();
    }
}

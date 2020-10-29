package javaEDU.oop.companytask.workers.constructionsite;

import javaEDU.oop.companytask.interfaces.Designable;
import javaEDU.oop.companytask.interfaces.Leadable;

public class Architect extends Engineer implements Designable, Leadable {
    @Override
    public void design() {
        System.out.println("Проектирует");
    }

    @Override
    public void lead() {
        System.out.println("Руководит");
    }
}

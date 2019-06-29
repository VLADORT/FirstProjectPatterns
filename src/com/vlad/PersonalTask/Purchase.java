package com.vlad.PersonalTask;

public  class  Purchase  {

    private Good good;
    private double inputMoney;
    private double requiredMoney;
    private Tray processingTray = new Tray();
    private int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Good getGood() {
        return good;
    }

    public void setGood(Good good) {
        this.good = good;
    }

    public double getInputMoney() {
        return inputMoney;
    }

    public void setInputMoney(double inputMoney) {
        this.inputMoney = inputMoney;
    }

    public double getRequiredMoney() {
        return requiredMoney;
    }

    public void setRequiredMoney(double requiredMoney) {
        this.requiredMoney = requiredMoney;
    }

    public Tray getProcessingTray() {
        return processingTray;
    }

    public void setProcessingTray(Tray processingTray) {
        this.processingTray = processingTray;
    }


}

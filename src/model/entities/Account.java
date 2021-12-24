/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.entities;

import model.exceptions.BusinessException;

/**
 *
 * @author Gustavo
 */
public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;
    
    public Account(){
    }
    public Account(Integer number,String holder,Double balance,Double withDrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }
    public Integer getNumber(){
        return number;
    }
    public void setNumber(Integer number){
        this.number = number;
    }
    public String getHolder(){
        return holder;
    }
    public void setHolder(String holder){
        this.holder = holder;
    }
    public Double getBalance(){
        return balance;
    }
    public void setBalance(Double balance){
        this.balance = balance;
    }
    public Double getWithDrawLimit(){
        return withDrawLimit;
    }
    public void setWithDrawLimit(Double withDrawLimit){
        this.withDrawLimit = withDrawLimit;
    }
    public void deposity(double amount){
        balance += amount;
    }
    public void wihtDraw(double amount){
        validetWithdraw(amount);
        balance -= amount;
    }    
    private void validetWithdraw(double amount){
        if(amount > getBalance()){
            throw new BusinessException("Withdraw error: the amount exceeds the withdraw limit");
        }
        if(amount > getWithDrawLimit()){
            throw new BusinessException("Balance error: insifficient balance");
        }
    }
}


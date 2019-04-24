/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.dao;

import java.util.List;

/**
 *
 * @author Raniel
 * @param <T>
 */
public abstract class TemplateMethods<T> {
       
    protected abstract List<T> getAll();
     
    protected abstract boolean save(T t);
     
    protected abstract boolean update(T t);
     
    protected abstract boolean delete(T t);
    
    protected abstract T listarPorId (int id);
    
    
     
    
     
    
     
    

}

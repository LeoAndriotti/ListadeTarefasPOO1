package br.ulbra.gerenciadorTarefas;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Gerenciador {

    public ArrayList<String> tarefa;
    public Gerenciador() {
      tarefa = new ArrayList();
    }
    public void adicionar(String elemento){
        if(elemento.equals("") || elemento.equals(" ")){
            JOptionPane.showMessageDialog(null, "INFORME UMA TAREFA!!!");
        }
        else{
            tarefa.add(elemento);
            JOptionPane.showMessageDialog(null, elemento+" SALVA COM SUCESSO");
        }
    }
    public void editar(int i, String editTarefa){
        if(tarefa.isEmpty()){
            JOptionPane.showMessageDialog(null, "LISTA DE TAREFAS VAZIA");
        }
        else if(i>=tarefa.size() || i<0){
        JOptionPane.showMessageDialog(null,"TAREFA INEXISTENTE");
    }
        else{
           tarefa.set(i, editTarefa);
           JOptionPane.showMessageDialog(null, "TAREFA: "+(i+1)+" ALTERADA COM SUCESSO");
        }
    }
    public void remover(int i){
        if(tarefa.isEmpty()){
            JOptionPane.showMessageDialog(null, "NENHUMA TAREFA DISPONÍVEL PARA SER REMOVIDA");
        }
        else if(i>=tarefa.size() || i<0){
            JOptionPane.showMessageDialog(null, "CÓDIGO DA TAREFA NÃO CONSTA NO SISTEMA");
        }
        else{
            tarefa.remove(i);
            JOptionPane.showMessageDialog(null, "TAREFA REMOVIDA COM SUCESSO");
        }
    }
    public String visualizar(){
        String visTarefa="";
        if(tarefa.isEmpty()){
          return  "NÃO FOI LANÇADA NENHUMA TAREFA NO SISTEMA";
        }
        else {
            for(int i=0;i<tarefa.size();i++){
            visTarefa +=(i+1)+"-"+ tarefa.get(i)+"\n";
        }
    }
          return visTarefa;
  }
      public String visualizarVazia(){
          if(tarefa.isEmpty()){
            return  "LISTA DE TAREFAS VÁZIA";
          }
          else{
            return "CONTÉM UMA OU MAIS TAREFAS CRIADAS";
          }
          
      }
      public void verificarQuant(){
         JOptionPane.showMessageDialog(null, tarefa.size()+" TAREFAS CRIADAS");
 }
      public void ordernar(){
          Collections.sort(tarefa);
      }
      public void excluir(){
          tarefa.clear();
      }
      public void moverTopo(){
       int tar = Integer.parseInt(JOptionPane.showInputDialog("QUAL TAREFA SERÁ PRIORIZADA?"))-1;
       String tarefaPrio = (String) tarefa.get(tar);
       int posicao = Integer.parseInt(JOptionPane.showInputDialog("INFORME A NOVA POSIÇÃO: "))-1;
       String novaPos = (String) tarefa.get(posicao);
       tarefa.set(tar, novaPos);
       tarefa.set(posicao, tarefaPrio);
        }  
    }

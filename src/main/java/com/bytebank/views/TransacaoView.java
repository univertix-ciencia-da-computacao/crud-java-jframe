package com.bytebank.views;

import javax.swing.JFrame;

import com.bytebank.controllers.TransacaoController;

public class TransacaoView extends JFrame {
  private TransacaoController controller = new TransacaoController();

  public TransacaoView() {
    setTitle("Sistema de Transações ByteBank");
    setSize(600, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  
}

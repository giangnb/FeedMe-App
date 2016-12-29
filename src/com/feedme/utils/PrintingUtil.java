/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.feedme.utils;

import java.awt.Color;
import java.awt.print.PrinterException;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

/**
 *
 * @author Giang
 */
public class PrintingUtil {
    private JTextPane txt;
    private StyledDocument doc;
    
    public PrintingUtil(){
        txt = new JTextPane();
        txt.setText("");
        doc = txt.getStyledDocument();
    }
    
    public void append(String text) throws BadLocationException {
        doc.insertString(doc.getLength(), text, null);
        txt.setCaretPosition(txt.getDocument().getLength());
    }
    
    public void append(String text, AttributeSet attr) throws BadLocationException {
        doc.insertString(doc.getLength(), text, attr);
        txt.setCaretPosition(txt.getDocument().getLength());
    }
    
    public void append(String text, String font, int size, int align, Color color) throws BadLocationException {
        StyleContext sc = StyleContext.getDefaultStyleContext();
        AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);
        aset = sc.addAttribute(aset, StyleConstants.FontFamily, font);
        aset = sc.addAttribute(aset, StyleConstants.FontSize, size);
        aset = sc.addAttribute(aset, StyleConstants.Alignment, align);
        append(text, aset);
    }
    
    public void print(String content) throws PrinterException {
        txt.setText(content);
        txt.print();
    }
    
    public void print() throws PrinterException {
        txt.print();
    }
}

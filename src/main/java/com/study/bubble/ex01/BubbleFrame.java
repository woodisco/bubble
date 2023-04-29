package com.study.bubble.ex01;

import javax.swing.*;

// 윈도우 창
public class BubbleFrame extends JFrame {
    private JLabel backgroundMap;
    private Player player;

    public BubbleFrame() {
        initObject();
        initSetting();
        setVisible(true); // 그림 그리기
    }

    private void initObject() {
        backgroundMap = new JLabel(new ImageIcon("image/backgroundMap.png"));
        setContentPane(backgroundMap); // JFrame을 JLabel로 변경

        player = new Player();
        add(player);
    }

    private void initSetting() {
        setSize(1000, 640);
        setLayout(null); // absolute 레이아웃 (그람을 자유롭게 그릴 수 있다)

        setLocationRelativeTo(null); // JFrame 가운데 배치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X버튼으로 창을 닫을 때, JVM도 종료
    }

    public static void main(String[] args) {

        new BubbleFrame();
    }
}

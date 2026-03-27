package sukkiri.chapter19;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class JFramePancelSample extends JFrame{
	public JFramePancelSample() {
		setTitle("テストダイアログ（パネルあり）");
		setBounds(100, 100, 600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();

		// ボタン作成
		JButton button1 = new JButton("ボタン１");

		// コンテントペインにボタンを追加（左）
		contentPane.add(button1, BorderLayout.WEST);

		// 中間コンテナのJPanelを生成
		JPanel panel = new JPanel();

		// ボタン作成
		JButton button2 = new JButton("ボタン２");

		// JPanelにボタンを追加
		panel.add(button2);
		
		// ボタン作成
		JButton button3 = new JButton("ボタン３");

		// JPanelにボタンを追加
		panel.add(button3);

		// コンテントペインにパネルを追加（上）
		contentPane.add(panel, BorderLayout.NORTH);


	}

}

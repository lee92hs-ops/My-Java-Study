package sukkiri.chapter19;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class JFrameSample extends JFrame{
	
	public JFrameSample() {
		// タイトル
		setTitle("テストダイアログ");
		// 画面のサイズ
		setBounds(200, 100, 400, 400);
		// 閉じるボタンがクリックされた時の処理
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// コンテントペインを取得
		Container contentPane = getContentPane();
		
		// ボタンを作成
		JButton button = new JButton("ボタン");
		// アクションリスナーを追加
		button.addActionListener(new ButtonListener());
		
		// コンテントペインにボタンを追加
		contentPane.add(button, BorderLayout.NORTH);
	}
	
	// ボタンが押された時のイベントクラス
	class ButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// ボタンが押された時の処理を書く
			
			// メッセージダイアログを表示
			JOptionPane.showMessageDialog(JFrameSample.this, "ボタンが押されました");
		}


}
}
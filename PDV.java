import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.time.LocalDate;

public class PDV {

	public static void main(String[] args) {
		JFrame frame = new JFrame("PDV");
		JPanel panel = new JPanel();
		
		LocalDate data = LocalDate.now();
		JLabel infoData = new JLabel("Data: " + data);
		JLabel caixa = new JLabel("CAIXA");
		JLabel valor = new JLabel("Valor Total: ");
		JTextField preco = new JTextField("0");
		JLabel desconto = new JLabel("Desconto: ");
		JTextField porcentagem = new JTextField("0");
		JLabel sinal = new JLabel("%");
		JLabel total = new JLabel("Total com Desconto: ");
		JTextField precoTotal = new JTextField();
		JLabel pagamento = new JLabel("Valor Pago: ");
		JTextField valorPago = new JTextField("0");
		JLabel troco = new JLabel("Troco: ");
		JTextField valorTroco = new JTextField();
		
		JButton calcula = new JButton("CALCULAR");
		JButton limpa = new JButton("LIMPAR");
		JButton calculaTroco = new JButton("CALCULAR TROCO");
		
		
		calcula.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float numPreco = Float.valueOf(preco.getText());
				float numDesconto = Float.valueOf(porcentagem.getText());
				float tira = numPreco * (numDesconto / 100);
				float pagar = numPreco - tira;
				precoTotal.setText(pagar + "");
			}
		});
		
		limpa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				preco.setText("0");
				porcentagem.setText("0");
				precoTotal.setText("");
				valorPago.setText("0");
				valorTroco.setText("");
			}
		});
		
		calculaTroco.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				float numPreco = Float.valueOf(preco.getText());
				float numDesconto = Float.valueOf(porcentagem.getText());
				float tira = numPreco * (numDesconto / 100);
				float dinheiro = Float.valueOf(valorPago.getText());
				float pagar = numPreco - tira;
				float change = dinheiro - pagar;
				valorTroco.setText(change + "");
			}
		});
		
		panel.setLayout(null);
		infoData.setBounds(0, 0, 100, 20);
		caixa.setBounds(180, 20, 80, 30);
		valor.setBounds(120, 60, 100, 30);
		preco.setBounds(190, 65, 80, 20);
		desconto.setBounds(125, 90, 100, 30);
		porcentagem.setBounds(190, 95, 80, 20);
		sinal.setBounds(280, 90, 100, 30);
		total.setBounds(65, 120, 120, 30);
		precoTotal.setBounds(190, 125, 80, 20);
		pagamento.setBounds(115, 150, 100, 30);
		valorPago.setBounds(190, 155, 80, 20);
		troco.setBounds(145, 180, 100, 30);
		valorTroco.setBounds(190, 185, 80, 20);
		precoTotal.setEditable(false);
		valorTroco.setEditable(false);
		calcula.setBounds(80, 230, 100, 30);
		limpa.setBounds(200, 230, 100, 30);
		calculaTroco.setBounds(80, 280, 220, 30);
		
		panel.add(infoData);
		panel.add(caixa);
		panel.add(valor);
		panel.add(preco);
		panel.add(desconto);
		panel.add(porcentagem);
		panel.add(sinal);
		panel.add(total);
		panel.add(precoTotal);
		panel.add(pagamento);
		panel.add(valorPago);
		panel.add(troco);
		panel.add(valorTroco);
		panel.add(calcula);
		panel.add(limpa);
		panel.add(calculaTroco);
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 370);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		

	}

}

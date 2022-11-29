		package listeners;
		
		import java.awt.CardLayout;
		import java.awt.event.ActionEvent;
		import java.awt.event.ActionListener;
		import javax.swing.JPanel;
		
		public class ChangePageListener implements ActionListener {
			private JPanel cards;
			private CardLayout layout;
			private String target;
			
			public ChangePageListener(JPanel pages, String target) {
				this.cards  = pages;
				this.layout = (CardLayout)pages.getLayout();
				this.target = target;
			}
		
			@Override
			public void actionPerformed(ActionEvent arg0) {
				layout.show(cards, target);
			}
		}

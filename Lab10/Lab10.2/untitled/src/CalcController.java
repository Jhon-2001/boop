
import java.awt.event.*;
public class CalcController {

    private CalcModel m_model;
    private CalcView  m_view;

    constructor

    CalcController(CalcModel model, CalcView view) {
        m_model = model;
        m_view  = view;

        view.addMultiplyListener(new MultiplyListener());
        view.addClearListener(new ClearListener());
    }
    class MultiplyListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = "";
            try {
                userInput = m_view.getUserInput();
                m_model.multiplyBy(userInput);
                m_view.setTotal(m_model.getValue());
            } catch (NumberFormatException nfex) {
                m_view.showError("Bad input: '" + userInput + "'");
            }
        }
    }
     *   2. Reset View.
            */
    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            m_model.reset();
            m_view.reset();
        }
    }
}

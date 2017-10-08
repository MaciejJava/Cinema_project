package com.mycompany.entity.presenter;

import com.mycompany.entity.Seance;
import com.mycompany.entity.dao.SeanceDAO;
import com.mycompany.entity.view.SeanceView;
import com.mycompany.entity.view.Window;

import java.util.List;

import static com.mycompany.entity.view.Window.window;

public class SeancePresenter {

    private SeanceDAO seanceDAO = new SeanceDAO();
    private SeanceView seanceView;
    Window main = window;

    public SeancePresenter(SeanceView seanceView) {
        this.seanceView = seanceView;
    }

    public void fillSeanceTable() {
        List<Seance> allSeances = seanceDAO.getSeanceList();
        for (Seance m : allSeances) {
            String[] seancesData = {String.valueOf(m.getSeance_id()),String.valueOf(m.getTime()), String.valueOf(m.getRoom()), String.valueOf(m.getRoomNumRows()), String.valueOf(m.getRoomNumCols()), String.valueOf(m.getMovie().getTitle())};
            window.getTableModel2().addRow(seancesData);
        }
    }
}


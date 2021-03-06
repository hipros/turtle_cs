package npclinic.cs.dto.menu;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;

@Getter
@Setter
@ToString
public class HeaderMenuDTO {

    private int id;
    private String title;
    private int orderNum;
    private String url;
    private ArrayList<DropMenuDTO> dropMenus;
}

package view;

import model.Teacher;

import java.util.List;
import java.util.logging.Logger;

public class TeacherView implements UserView<Teacher>{
    Logger logger = Logger.getLogger(TeacherView.class.getName());

    @Override
    public void sendOnConsole(List<Teacher> list) {
        for(Teacher teacher: list){
            logger.info(teacher.toString());
        }
    }
}

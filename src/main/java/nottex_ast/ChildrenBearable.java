package nottex_ast;

import java.util.List;

public interface ChildrenBearable {

    List<NottexNode> getChildren();

    boolean hasChildren();
}

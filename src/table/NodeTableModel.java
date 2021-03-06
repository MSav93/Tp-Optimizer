package table;

import java.util.Collection;

import javax.swing.table.AbstractTableModel;

import tree.Node;

public class NodeTableModel extends AbstractTableModel {
  private static final long serialVersionUID = -7480665278104499754L;
  Collection<Node> nodes;

  public NodeTableModel(Collection<Node> nodes) {
    this.nodes = nodes;
  }

  public NodeTableModel() {}

  @SuppressWarnings({"unchecked", "rawtypes"})
  public Class getColumnClass(int columnIndex) {
    return Node.class;
  }

  public void addData(Collection<Node> nodes) {
    this.nodes = nodes;
  }

  public int getColumnCount() {
    return 1;
  }

  public String getColumnName(int columnIndex) {
    return "Nodes";
  }

  public Node getValueAt(int rowIndex) {
    return (nodes == null) ? null : nodes.toArray(new Node[] {})[rowIndex];
  }

  public int getRowCount() {
    return (nodes == null) ? 0 : nodes.size();
  }

  public Node getValueAt(int rowIndex, int columnIndex) {
    return (nodes == null) ? null : nodes.toArray(new Node[] {})[rowIndex];
  }

  public boolean isCellEditable(int rowIndex, int columnIndex) {
    return false;
  }
}

package sample.views.nodes;

import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Skin;

public abstract class BaseNode<T extends Node> extends Control implements Skin<BaseNode> {
    private final T root;

    public BaseNode(T root) {
        this.root = root;
        setSkin(this);
    }

    @Override
    public BaseNode getSkinnable() {
        return this;
    }

    @Override
    public T getNode() {
        draw(root);
        return root;
    }

    @Override
    public void dispose() {

    }

    public abstract void draw(T root);
}

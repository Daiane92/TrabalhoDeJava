package controller;

import java.util.Map;

import javax.swing.JDialog;

import model.entity.Produto;
import model.factories.ProdutoFactory;

import view.vo.ProdutoVO;

public class ProdutosController {
	
	public static void newResource() {
		JDialog view = new view.produto.New();
		view.setVisible(true);
	}
	
	public static void edit() {}
	
	public static void create(ProdutoVO vo) {
		Produto novoProduto = ProdutoFactory.getProdutoByVO(vo);
	}
	
	public static void update() {}
	
	public static void destroy() {}
}

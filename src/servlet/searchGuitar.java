 package servlet;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.IDAO.InventoryImpl;
import com.IDAO.InventoryIDAO;

import param.Builder;
import param.Type;
import param.Wood;
import model.Guitar;
import model.GuitarSpec;
import model.Inventory;

/**
 * Servlet implementation class searchGuitar
 */
@WebServlet("/searchGuitar")
public class searchGuitar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchGuitar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//调用库存
		String  builder=request.getParameter("builder");
		String  model=request.getParameter("model");
		String  type=request.getParameter("type");
		String  numStrings=request.getParameter("numStrings");
		String  topwood=request.getParameter("topwood");
		String  backwood=request.getParameter("backwood");
		//用户构想的吉他规格
		 GuitarSpec whatErinLikes = new GuitarSpec(builder, model, 
			       type, Integer.parseInt(numStrings),backwood, topwood);
		 InventoryIDAO inventoryIDAO=new InventoryImpl();
		 Inventory inventory=new Inventory();
		    try{
		    	inventory =inventoryIDAO.getInventorys();
		    }catch(Exception e){
		    	//TODO Auto-generated catch block 
		    	e.printStackTrace();
		    }
		    
		 
				 
		//调用库存的search方法，返回list
		    List matchingGuitars = Inventory.search(whatErinLikes);
		    request.setAttribute("guitars", matchingGuitars);
		    request.getRequestDispatcher("result.jsp").forward(request,response);
		   
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

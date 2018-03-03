package system;
public class calculation{
	public int calculation(int dayinput,int selectinput){
		int ps=300,s=250,dd=100,selectdata,resulta;
		if (selectinput==1)
		    selectdata=ps;
		else
	    if (selectinput==2)
		    selectdata=s;
	    else
	    	selectdata=dd;
		int tprice=selectdata*dayinput;
		return tprice;
	}
}
package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Dubl_By_Point;
import CC.Util.By.LMNt.Set_Dubl_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Point;
import CC.$.Q$Q.Dubl1$1;
import CC.$.Q$Q.Point$Dubl;
import CC.$.Q2$.Point_Dubl$;
import CC.$.Q2$1.Dubl2$1;

public interface Set_Dubl_By_Point<By_Typ,From_Typ> extends
	Get_Dubl_By_Point<By_Typ>,
	Set_Dubl_By_Q<From_Typ>,
	Set_Q_By_Point<By_Typ,From_Typ>,
	Point_Dubl$<By_Typ>
{
	@Lin_Dclar void Set_Dubl_By_Point(By_Typ By,double Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Point_Dubl$(By_Typ By,double Valu){Set_Dubl_By_Point(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl_By_Point_Sorc(By_Typ By,Point$Dubl<By_Typ> Sorc){Set_Dubl_By_Point(By,Sorc.Point$Dubl(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl1$1_By_Point(By_Typ By,Dubl1$1 Fun,double Valu)
		{Set_Dubl_By_Point(By,Fun.Dubl$Dubl(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl1$1_By_Point_Sorc(By_Typ By,Dubl1$1 Fun,Point$Dubl Sorc)
			{Set_Dubl1$1_By_Point(By,Fun,Sorc.Point$Dubl(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl1$1_By_Point(By_Typ By,Dubl1$1 Fun)
				{Set_Dubl1$1_By_Point_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl2$1_By_Point(By_Typ By,Dubl2$1 Fun,double A,double B)
		{Set_Dubl_By_Point(By,Fun.Dubl2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl2$1_By_Point_SLit(By_Typ By,Dubl2$1 Fun,Point$Dubl A,double B)
			{Set_Dubl2$1_By_Point(By,Fun,A.Point$Dubl(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl2$1_By_Point(By_Typ By,Dubl2$1 Fun,double B)
				{Set_Dubl2$1_By_Point_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Dubl2$1_By_Point_Sorc(By_Typ By,Dubl2$1 Fun,Point$Dubl A,Point$Dubl B)
				{Set_Dubl2$1_By_Point_SLit(By,Fun,A,B.Point$Dubl(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Dubl2$1_By_Point_Sorc(By_Typ By,Dubl2$1 Fun,Point$Dubl B)
					{Set_Dubl2$1_By_Point_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default double SGet_Dubl_By_Point(By_Typ By,double Valu)
	{
		double Stor=Get_Dubl_By_Point(By);
		Set_Dubl_By_Point(By,Valu);

		return Stor;
	}
}
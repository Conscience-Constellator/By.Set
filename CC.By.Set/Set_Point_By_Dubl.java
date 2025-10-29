package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Point_By_Dubl;
import CC.Util.By.LMNt.Set_Point_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Dubl;
import CC.$.Q$Q.Dubl$Point;
import CC.$.Q$Q.Point1$1;
import CC.$.Q2$.Dubl_Point$;
import CC.$.Q_Q$Q.Point2$1;

public interface Set_Point_By_Dubl<Valu_Typ,From_Typ> extends
	Get_Point_By_Dubl<Valu_Typ>,
	Set_Q_By_Dubl<From_Typ>,
	Set_Point_By_Q<Valu_Typ,From_Typ>,
	Dubl_Point$<Valu_Typ>
{
	@Lin_Dclar void Set_Point_By_Dubl(double By,Valu_Typ Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Dubl_Point$(double By,Valu_Typ Valu){Set_Point_By_Dubl(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point_By_Dubl_Sorc(double By,Dubl$Point<Valu_Typ> Sorc){Set_Point_By_Dubl(By,Sorc.Dubl$Point(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point1$1_By_Dubl(double By,Point1$1<Valu_Typ,Valu_Typ> Fun,Valu_Typ Valu)
		{Set_Point_By_Dubl(By,Fun.Point1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point1$1_By_Dubl_Sorc(double By,Point1$1<Valu_Typ,Valu_Typ> Fun,Dubl$Point<Valu_Typ> Sorc)
			{Set_Point1$1_By_Dubl(By,Fun,Sorc.Dubl$Point(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point1$1_By_Dubl(double By,Point1$1<Valu_Typ,Valu_Typ> Fun)
				{Set_Point1$1_By_Dubl_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point2$1_By_Dubl(double By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ A,Valu_Typ B)
		{Set_Point_By_Dubl(By,Fun.Point2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point2$1_By_Dubl_SLit(double By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Dubl$Point<Valu_Typ> A,Valu_Typ B)
			{Set_Point2$1_By_Dubl(By,Fun,A.Dubl$Point(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point2$1_By_Dubl(double By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ B)
				{Set_Point2$1_By_Dubl_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Point2$1_By_Dubl_Sorc(double By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Dubl$Point<Valu_Typ> A,Dubl$Point<Valu_Typ> B)
				{Set_Point2$1_By_Dubl_SLit(By,Fun,A,B.Dubl$Point(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Point2$1_By_Dubl_Sorc(double By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Dubl$Point<Valu_Typ> B)
					{Set_Point2$1_By_Dubl_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default Valu_Typ SGet_Point_By_Dubl(double By,Valu_Typ Valu)
	{
		Valu_Typ Stor=Get_Point_By_Dubl(By);
		Set_Point_By_Dubl(By,Valu);

		return Stor;
	}
}
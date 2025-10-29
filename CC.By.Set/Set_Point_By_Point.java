package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Point_By_Point;
import CC.Util.By.LMNt.Set_Point_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Point;
import CC.$.Q$Q.Point1$1;
import CC.$.Q2$.Point_Point$;
import CC.$.Q_Q$Q.Point2$1;

public interface Set_Point_By_Point<By_Typ,Valu_Typ,From_Typ> extends
	Get_Point_By_Point<By_Typ,Valu_Typ>,
	Set_Q_By_Point<By_Typ,From_Typ>,
	Set_Point_By_Q<Valu_Typ,From_Typ>,
	Point_Point$<By_Typ,Valu_Typ>
{
	@Lin_Dclar void Set_Point_By_Point(By_Typ By,Valu_Typ Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Point_Point$(By_Typ By,Valu_Typ Valu){Set_Point_By_Point(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point_By_Point_Sorc(By_Typ By,Point1$1<By_Typ,Valu_Typ> Sorc){Set_Point_By_Point(By,Sorc.Point1$1(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point1$1_By_Point(By_Typ By,Point1$1<Valu_Typ,Valu_Typ> Fun,Valu_Typ Valu)
			{Set_Point_By_Point(By,Fun.Point1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point1$1_By_Point_Sorc(By_Typ By,Point1$1<Valu_Typ,Valu_Typ> Fun,Point1$1<By_Typ,Valu_Typ> Sorc)
			{Set_Point1$1_By_Point(By,Fun,Sorc.Point1$1(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point1$1_By_Point(By_Typ By,Point1$1<Valu_Typ,Valu_Typ> Fun)
				{Set_Point1$1_By_Point_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Point2$1_By_Point(By_Typ By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ A,Valu_Typ B)
		{Set_Point_By_Point(By,Fun.Point2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Point2$1_By_Point_SLit(By_Typ By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Point1$1<By_Typ,Valu_Typ> A,Valu_Typ B)
			{Set_Point2$1_By_Point(By,Fun,A.Point1$1(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Point2$1_By_Point(By_Typ By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ B)
				{Set_Point2$1_By_Point_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Point2$1_By_Point_Sorc(By_Typ By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Point1$1<By_Typ,Valu_Typ> A,Point1$1<By_Typ,Valu_Typ> B)
				{Set_Point2$1_By_Point_SLit(By,Fun,A,B.Point1$1(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Point2$1_By_Point_Sorc(By_Typ By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Point1$1<By_Typ,Valu_Typ> B)
					{Set_Point2$1_By_Point_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default Valu_Typ SGet_Point_By_Point(By_Typ By,Valu_Typ Valu)
	{
		Valu_Typ Stor=Get_Point_By_Point(By);
		Set_Point_By_Point(By,Valu);

		return Stor;
	}
}
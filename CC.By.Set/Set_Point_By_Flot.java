package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Point_By_Flot;
import CC.Util.By.LMNt.Set_Point_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Flot;
import CC.$.Q$Q.Flot$Point;
import CC.$.Q$Q.Point1$1;
import CC.$.Q2$.Flot_Point$;
import CC.$.QQ$Q.Point2$1;

public interface Set_Point_By_Flot<Valu_Typ,From_Typ> extends
		Get_Point_By_Flot<Valu_Typ>,
		Set_Q_By_Flot<From_Typ>,
		Set_Point_By_Q<Valu_Typ,From_Typ>,
		Flot_Point$<Valu_Typ>
{
	@Lin_Dclar
	void Set_Point_By_Flot(float By,Valu_Typ Valu);
		@Override @Neds_Ovrid(NEds=No)
		default void Flot_Point$(float By,Valu_Typ Valu){Set_Point_By_Flot(By,Valu);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Point_By_Flot_Sorc(float By,Flot$Point<Valu_Typ> Sorc){Set_Point_By_Flot(By,Sorc.Flot$Point(By));}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Point1$1_By_Flot(float By,Point1$1<Valu_Typ,Valu_Typ> Fun,Valu_Typ Valu)
		{Set_Point_By_Flot(By,Fun.Point1$1(Valu));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Point1$1_By_Flot_Sorc(float By,Point1$1<Valu_Typ,Valu_Typ> Fun,Flot$Point<Valu_Typ> Sorc)
			{Set_Point1$1_By_Flot(By,Fun,Sorc.Flot$Point(By));}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Point1$1_By_Flot(float By,Point1$1<Valu_Typ,Valu_Typ> Fun)
				{Set_Point1$1_By_Flot_Sorc(By,Fun,this);}
		@Lin_Dclar @Neds_Ovrid(NEds=No)
		default void Set_Point2$1_By_Flot(float By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ A,Valu_Typ B)
		{Set_Point_By_Flot(By,Fun.Point2$1(A,B));}
			@Lin_Dclar @Neds_Ovrid(NEds=No)
			default void Set_Point2$1_By_Flot_SLit(float By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Flot$Point<Valu_Typ> A,Valu_Typ B)
			{Set_Point2$1_By_Flot(By,Fun,A.Flot$Point(By),B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Mod_Point2$1_By_Flot(float By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Valu_Typ B)
				{Set_Point2$1_By_Flot_SLit(By,Fun,this,B);}
				@Lin_Dclar @Neds_Ovrid(NEds=No)
				default void Set_Point2$1_By_Flot_Sorc(float By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Flot$Point<Valu_Typ> A,Flot$Point<Valu_Typ> B)
				{Set_Point2$1_By_Flot_SLit(By,Fun,A,B.Flot$Point(By));}
					@Lin_Dclar @Neds_Ovrid(NEds=No)
					default void Mod_Point2$1_By_Flot_Sorc(float By,Point2$1<Valu_Typ,Valu_Typ,Valu_Typ> Fun,Flot$Point<Valu_Typ> B)
					{Set_Point2$1_By_Flot_Sorc(By,Fun,this,B);}

	@Lin_Dclar @Neds_Ovrid(NEds=No)
	default Valu_Typ SGet_Point_By_Flot(float By,Valu_Typ Valu)
	{
		Valu_Typ Stor=Get_Point_By_Flot(By);
		Set_Point_By_Flot(By,Valu);

		return Stor;
	}
}
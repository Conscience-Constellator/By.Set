package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Flot_By_Point;
import CC.Util.By.LMNt.Set_Flot_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Point;
import CC.$.Q$Q.Flot1$1;
import CC.$.Q$Q.Point$Flot;
import CC.$.Q2$.Point_Flot$;
import CC.$.Q2$1.Flot2$1;

public interface Set_Flot_By_Point<By_Typ,From_Typ> extends
	Get_Flot_By_Point<By_Typ>,
	Set_Q_By_Point<By_Typ,From_Typ>,
	Set_Flot_By_Q<From_Typ>,
	Point_Flot$<By_Typ>
{
	@Lin_Dclar void Set_Flot_By_Point(By_Typ By,float Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Point_Flot$(By_Typ By,float Valu){Set_Flot_By_Point(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot_By_Point_Sorc(By_Typ By,Point$Flot<By_Typ> Sorc){Set_Flot_By_Point(By,Sorc.Point$Flot(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot1$1_By_Point(By_Typ By,Flot1$1 Fun,float Valu)
		{Set_Flot_By_Point(By,Fun.Flot1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot1$1_By_Point_Sorc(By_Typ By,Flot1$1 Fun,Point$Flot<By_Typ> Sorc)
			{Set_Flot1$1_By_Point(By,Fun,Sorc.Point$Flot(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot1$1_By_Point(By_Typ By,Flot1$1 Fun)
				{Set_Flot1$1_By_Point_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Flot2$1_By_Point(By_Typ By,Flot2$1 Fun,float A,float B)
		{Set_Flot_By_Point(By,Fun.Flot2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Flot2$1_By_Point_SLit(By_Typ By,Flot2$1 Fun,Point$Flot<By_Typ> A,float B)
			{Set_Flot2$1_By_Point(By,Fun,A.Point$Flot(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Flot2$1_By_Point(By_Typ By,Flot2$1 Fun,float B)
				{Set_Flot2$1_By_Point_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Flot2$1_By_Point_Sorc(By_Typ By,Flot2$1 Fun,Point$Flot<By_Typ> A,Point$Flot<By_Typ> B)
				{Set_Flot2$1_By_Point_SLit(By,Fun,A,B.Point$Flot(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Flot2$1_By_Point_Sorc(By_Typ By,Flot2$1 Fun,Point$Flot<By_Typ> B)
					{Set_Flot2$1_By_Point_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default float SGet_Flot_By_Point(By_Typ By,float Valu)
	{
		float Stor=Get_Flot_By_Point(By);
		Set_Flot_By_Point(By,Valu);

		return Stor;
	}
}
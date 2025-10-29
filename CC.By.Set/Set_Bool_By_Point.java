package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Bool_By_Point;
import CC.Util.By.Set_Q_By_Q;
import CC.$.Q$Q.Bool$Bool;
import CC.$.Q$Q.Point$Bool;
import CC.$.Q2$.Point_Bool$;
import CC.$.Q2$1.Bool2$1;

public interface Set_Bool_By_Point<By_Typ,From_Typ> extends
	Get_Bool_By_Point<By_Typ>,
	Set_Q_By_Q<From_Typ>,
	Point_Bool$<By_Typ>
{
	@Lin_Dclar void Set_Bool_By_Point(By_Typ By,boolean Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Point_Bool$(By_Typ By,boolean Valu){Set_Bool_By_Point(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool_By_Point_Sorc(By_Typ By,Point$Bool<By_Typ> Sorc){Set_Bool_By_Point(By,Sorc.Point$Bool(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool1$1_By_Bool(By_Typ By,Bool$Bool Fun,boolean Valu)
		{Set_Bool_By_Point(By,Fun.Bool$Bool(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool1$1_By_Point_Sorc(By_Typ By,Bool$Bool Fun,Point$Bool Sorc)
			{Set_Bool1$1_By_Bool(By,Fun,Sorc.Point$Bool(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool1$1_By_Bool(By_Typ By,Bool$Bool Fun)
				{Set_Bool1$1_By_Point_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Bool2$1_By_Bool(By_Typ By,Bool2$1 Fun,boolean A,boolean B)
		{Set_Bool_By_Point(By,Fun.Bool2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Bool2$1_By_Bool_SLit(By_Typ By,Bool2$1 Fun,Point$Bool<By_Typ> A,boolean B)
			{Set_Bool2$1_By_Bool(By,Fun,A.Point$Bool(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Bool2$1_By_Bool(By_Typ By,Bool2$1 Fun,boolean B)
				{Set_Bool2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Bool2$1_By_Bool_Sorc(By_Typ By,Bool2$1 Fun,Point$Bool<By_Typ> A,Point$Bool<By_Typ> B)
				{Set_Bool2$1_By_Bool_SLit(By,Fun,A,B.Point$Bool(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Bool2$1_By_Bool_Sorc(By_Typ By,Bool2$1 Fun,Point$Bool<By_Typ> B)
					{Set_Bool2$1_By_Bool_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default boolean SGet_Bool_By_Point(By_Typ By,boolean Valu)
	{
		boolean Stor=Get_Bool_By_Point(By);
		Set_Bool_By_Point(By,Valu);

		return Stor;
	}
}
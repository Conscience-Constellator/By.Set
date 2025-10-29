package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Int_By_Flot;
import CC.Util.By.LMNt.Set_Long_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Flot;
import CC.$.Q$Q.Flot$Int;
import CC.$.Q$Q.Int1$1;
import CC.$.Q2$.Flot_Int$;
import CC.$.Q_Q$Q.Int2$1;

public interface Set_Int_By_Flot<From_Typ> extends
	Get_Int_By_Flot,
	Set_Q_By_Flot<From_Typ>,
	Set_Long_By_Q<From_Typ>,
	Flot_Int$
{
	@Lin_Dclar void Set_Int_By_Flot(float By,int Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Flot_Int$(float By,int Valu){Set_Int_By_Flot(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int_By_Flot_Sorc(float By,Flot$Int Sorc){Set_Int_By_Flot(By,Sorc.Flot$Int(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int1$1_By_Flot(float By,Int1$1 Fun,int Valu)
		{Set_Int_By_Flot(By,Fun.Int1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int1$1_By_Flot_Sorc(float By,Int1$1 Fun,Flot$Int Sorc)
			{Set_Int1$1_By_Flot(By,Fun,Sorc.Flot$Int(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int1$1_By_Flot(float By,Int1$1 Fun)
				{Set_Int1$1_By_Flot_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int2$1_By_Flot(float By,Int2$1 Fun,int A,int B)
		{Set_Int_By_Flot(By,Fun.Int2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int2$1_By_Flot_SLit(float By,Int2$1 Fun,Flot$Int A,int B)
			{Set_Int2$1_By_Flot(By,Fun,A.Flot$Int(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int2$1_By_Flot(float By,Int2$1 Fun,int B)
				{Set_Int2$1_By_Flot_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Int2$1_By_Flot_Sorc(float By,Int2$1 Fun,Flot$Int A,Flot$Int B)
				{Set_Int2$1_By_Flot_SLit(By,Fun,A,B.Flot$Int(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Int2$1_By_Flot_Sorc(float By,Int2$1 Fun,Flot$Int B)
					{Set_Int2$1_By_Flot_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default int SGet_Int_By_Flot(float By,int Valu)
	{
		int Stor=Get_Int_By_Flot(By);
		Set_Int_By_Flot(By,Valu);

		return Stor;
	}
}
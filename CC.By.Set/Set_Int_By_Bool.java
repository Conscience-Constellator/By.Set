package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Int_By_Bool;
import CC.Util.By.LMNt.Set_Int_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Bool;
import CC.$.Q$Q.Bool$Int;
import CC.$.Q$Q.Int1$1;
import CC.$.Q2$.Bool_Int$;
import CC.$.Q_Q$Q.Int2$1;

public interface Set_Int_By_Bool<From_Typ> extends
	Get_Int_By_Bool,
	Set_Q_By_Bool<From_Typ>,
	Set_Int_By_Q<From_Typ>,
	Bool_Int$
{
	@Lin_Dclar void Set_Int_By_Bool(boolean By,int Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Bool_Int$(boolean By,int Valu){Set_Int_By_Bool(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int_By_Bool_Sorc(boolean By,Bool$Int Sorc){Set_Int_By_Bool(By,Sorc.Bool$Int(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int1$1_By_Bool(boolean By,Int1$1 Fun,int Valu)
		{Set_Int_By_Bool(By,Fun.Int1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int1$1_By_Bool_Sorc(boolean By,Int1$1 Fun,Bool$Int Sorc)
			{Set_Int1$1_By_Bool(By,Fun,Sorc.Bool$Int(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int1$1_By_Bool(boolean By,Int1$1 Fun)
				{Set_Int1$1_By_Bool_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int2$1_By_Bool(boolean By,Int2$1 Fun,int A,int B)
		{Set_Int_By_Bool(By,Fun.Int2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int2$1_By_Bool_SLit(boolean By,Int2$1 Fun,Bool$Int A,int B)
			{Set_Int2$1_By_Bool(By,Fun,A.Bool$Int(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int2$1_By_Bool(boolean By,Int2$1 Fun,int B)
				{Set_Int2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Int2$1_By_Bool_Sorc(boolean By,Int2$1 Fun,Bool$Int A,Bool$Int B)
				{Set_Int2$1_By_Bool_SLit(By,Fun,A,B.Bool$Int(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Int2$1_By_Bool_Sorc(boolean By,Int2$1 Fun,Bool$Int B)
					{Set_Int2$1_By_Bool_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default int SGet_Int_By_Bool(boolean By,int Valu)
	{
		int Stor=Get_Int_By_Bool(By);
		Set_Int_By_Bool(By,Valu);

		return Stor;
	}
}
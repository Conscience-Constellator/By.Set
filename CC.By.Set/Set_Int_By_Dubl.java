package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Int_By_Dubl;
import CC.Util.By.LMNt.Set_Int_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Dubl;
import CC.$.Q$Q.Dubl$Int;
import CC.$.Q$Q.Int1$1;
import CC.$.Q2$.Dubl_Int$;
import CC.$.Q_Q$Q.Int2$1;

public interface Set_Int_By_Dubl<From_Typ> extends
	Get_Int_By_Dubl,
	Set_Q_By_Dubl<From_Typ>,
	Set_Int_By_Q<From_Typ>,
	Dubl_Int$
{
	@Lin_Dclar void Set_Int_By_Dubl(double By,int Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Dubl_Int$(double By,int Valu){Set_Int_By_Dubl(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int_By_Dubl_Sorc(double By,Dubl$Int Sorc){Set_Int_By_Dubl(By,Sorc.Dubl$Int(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int1$1_By_Dubl(double By,Int1$1 Fun,int Valu)
		{Set_Int_By_Dubl(By,Fun.Int1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int1$1_By_Dubl_Sorc(double By,Int1$1 Fun,Dubl$Int Sorc)
			{Set_Int1$1_By_Dubl(By,Fun,Sorc.Dubl$Int(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int1$1_By_Dubl(double By,Int1$1 Fun)
				{Set_Int1$1_By_Dubl_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int2$1_By_Dubl(double By,Int2$1 Fun,int A,int B)
		{Set_Int_By_Dubl(By,Fun.Int2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int2$1_By_Dubl_SLit(double By,Int2$1 Fun,Dubl$Int A,int B)
			{Set_Int2$1_By_Dubl(By,Fun,A.Dubl$Int(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int2$1_By_Dubl(double By,Int2$1 Fun,int B)
				{Set_Int2$1_By_Dubl_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Int2$1_By_Dubl_Sorc(double By,Int2$1 Fun,Dubl$Int A,Dubl$Int B)
				{Set_Int2$1_By_Dubl_SLit(By,Fun,A,B.Dubl$Int(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Int2$1_By_Dubl_Sorc(double By,Int2$1 Fun,Dubl$Int B)
					{Set_Int2$1_By_Dubl_Sorc(By,Fun,this,B);}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default int SGet_Int_By_Dubl(double By,int Valu)
	{
		int Stor=Get_Int_By_Dubl(By);
		Set_Int_By_Dubl(By,Valu);

		return Stor;
	}
}
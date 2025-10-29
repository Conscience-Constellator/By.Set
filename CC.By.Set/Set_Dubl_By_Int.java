package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Dubl_By_Int;
import CC.Util.By.LMNt.Set_Dubl_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Int;
import CC.$.Q$Q.Dubl1$1;
import CC.$.Q$Q.Int$Dubl;
import CC.$.Q2$.Int_Dubl$;
import CC.$.Q_Q$Q.Dubl2$1;

public interface Set_Dubl_By_Int<From_Typ> extends
	Get_Dubl_By_Int,
	Set_Dubl_By_Q<From_Typ>,
	Set_Q_By_Int<From_Typ>,
	Int_Dubl$
{
	@Lin_Dclar void Set_Dubl_By_Int(int By,double Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Int_Dubl$(int By,double Valu){Set_Dubl_By_Int(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl_By_Int_Sorc(int By,Int$Dubl Sorc){Set_Dubl_By_Int(By,Sorc.Int$Dubl(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl1$1_By_Int(int By,Dubl1$1 Fun,double Valu)
		{Set_Dubl_By_Int(By,Fun.Dubl$Dubl(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl1$1_By_Int_Sorc(int By,Dubl1$1 Fun,Int$Dubl Sorc)
			{Set_Dubl1$1_By_Int(By,Fun,Sorc.Int$Dubl(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl1$1_By_Int(int By,Dubl1$1 Fun)
				{Set_Dubl1$1_By_Int_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Dubl2$1_By_Int(int By,Dubl2$1 Fun,double A,double B)
		{Set_Dubl_By_Int(By,Fun.Dubl2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Dubl2$1_By_Bool_SLit(int By,Dubl2$1 Fun,Int$Dubl A,double B)
			{Set_Dubl2$1_By_Int(By,Fun,A.Int$Dubl(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Dubl2$1_By_Int(int By,Dubl2$1 Fun,double B)
				{Set_Dubl2$1_By_Bool_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Dubl2$1_By_Int_Sorc(int By,Dubl2$1 Fun,Int$Dubl A,Int$Dubl B)
				{Set_Dubl2$1_By_Bool_SLit(By,Fun,A,B.Int$Dubl(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Dubl2$1_By_Int_Sorc(int By,Dubl2$1 Fun,Int$Dubl B)
					{Set_Dubl2$1_By_Int_Sorc(By,Fun,this,B);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Sorc_Rang(int IndX,int Nd,Int$Dubl Sorc)
		{
			for(;IndX<Nd;IndX+=1){Set_Dubl_By_Int(IndX,Sorc.Int$Dubl(IndX));}
		}

	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default double SGet_Dubl_By_Int(int By,double Valu)
	{
		double Stor=Get_Dubl_By_Int(By);
		Set_Dubl_By_Int(By,Valu);

		return Stor;
	}
}
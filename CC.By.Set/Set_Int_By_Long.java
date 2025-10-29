package CC.Util.By.Set;

import CC.COd.Finishd;
import CC.COd.Lin_DclAr;
import CC.COd.Neds_Ovrid;
import static CC.COd.Neds_Ovrid.*;

import CC.Util.By.Get.Get_Int_By_Long;
import CC.Util.By.LMNt.Set_Int_By_Q;
import CC.Util.By.LMNt.Set_Q_By_Long;
import CC.$.Q$Q.Long$Int;
import CC.$.Q$Q.Int1$1;
import CC.$.Q2$.Long_Int$;
import CC.$.Q_Q$Q.Int2$1;

public interface Set_Int_By_Long<From_Typ> extends
	Get_Int_By_Long,
	Set_Q_By_Long<From_Typ>,
	Set_Int_By_Q<From_Typ>,
	Long_Int$
{
	@Lin_Dclar void Set_Int_By_Long(long By,int Valu);
		@Override
		@Nevr_Neds_Ovrid
		default void Long_Int$(long By,int Valu){Set_Int_By_Long(By,Valu);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int_By_Long_Sorc(long By,Long$Int Sorc){Set_Int_By_Long(By,Sorc.Long$Int(By));}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int1$1_By_Long(long By,Int1$1 Fun,int Valu)
		{Set_Int_By_Long(By,Fun.Int1$1(Valu));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int1$1_By_Long_Sorc(long By,Int1$1 Fun,Long$Int Sorc)
			{Set_Int1$1_By_Long(By,Fun,Sorc.Long$Int(By));}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int1$1_By_Long(long By,Int1$1 Fun)
				{Set_Int1$1_By_Long_Sorc(By,Fun,this);}
		@Lin_Dclar
		@Nevr_Neds_Ovrid
		default void Set_Int2$1_By_Long(long By,Int2$1 Fun,int A,int B)
		{Set_Int_By_Long(By,Fun.Int2$1(A,B));}
			@Lin_Dclar
			@Nevr_Neds_Ovrid
			default void Set_Int2$1_By_Long_SLit(long By,Int2$1 Fun,Long$Int A,int B)
			{Set_Int2$1_By_Long(By,Fun,A.Long$Int(By),B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Mod_Int2$1_By_Long(long By,Int2$1 Fun,int B)
				{Set_Int2$1_By_Long_SLit(By,Fun,this,B);}
				@Lin_Dclar
				@Nevr_Neds_Ovrid
				default void Set_Int2$1_By_Long_Sorc(long By,Int2$1 Fun,Long$Int A,Long$Int B)
				{Set_Int2$1_By_Long_SLit(By,Fun,A,B.Long$Int(By));}
					@Lin_Dclar
					@Nevr_Neds_Ovrid
					default void Mod_Int2$1_By_Long_Sorc(long By,Int2$1 Fun,Long$Int B)
					{Set_Int2$1_By_Long_Sorc(By,Fun,this,B);}
	
	@Lin_Dclar
	@Nevr_Neds_Ovrid
	default int SGet_Int_By_Long(long By,int Valu)
	{
		int Stor=Get_Int_By_Long(By);
		Set_Int_By_Long(By,Valu);

		return Stor;
	}
}